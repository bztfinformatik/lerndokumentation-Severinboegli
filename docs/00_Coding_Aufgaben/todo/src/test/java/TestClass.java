import com.severinboegli.Aufgabe;
import com.severinboegli.Benutzer;
import com.severinboegli.Bild;
import com.severinboegli.SharedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass {

    /**
     * Testet, ob ein Benutzer erstellt werden kann.
     * Der Benutzer bekommt einen Standardnamen und ein Standardpasswort.
     * 
     * Es wird getestet, ob alle Attribute richtig gesetzt werden.
     */
    @Test
    @DisplayName("Create User with standard values")
    public void createUserWithStandardValues() {

        // User bekommt Standartpassword, dieses soll immer 1234 sein.
        Benutzer user = new Benutzer("Severin", "Bögli", "21u2119@bztf.ch");

        // Die vergebenen Werte werden getestet.
        assertTrue(user.isPasswordCorrect("1234"));
        assertEquals("Severin", user.getVorname());
        assertEquals("Bögli", user.getNachname());
        assertEquals("21u2119@bztf.ch", user.getEmail());
    }

    /**
     * Testet, die Email-Adresse des Benutzers.
     * Es werden unterschiedliche E-Mail-Adressen getestet.
     * Es sollten nur E-Mail-Adressen akzeptiert werden, die folgendem Regex entsprechen:
     *          "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"
     */
    @Test
    @DisplayName("Test Email Input")
    public void emailCorrectTest() {
        Benutzer user = new Benutzer("Severin", "Bögli", "21u2119@bztf.ch");

        // Email soll angenommen werden und gleich bleiben.
        assertEquals("21u2119@bztf.ch", user.getEmail());

        // Email wird auf eine Falsch verändert, sollte nicht angenommen werden und "" zurückgeben.
        user.setEmail("severin@.com");
        assertNotEquals("21u2119@bztf.ch", user.getEmail());
        assertEquals("", user.getEmail());

        // Email sollte akzeptiert werden
        user.setEmail("severin.boegli@bernina.com");
        assertEquals("severin.boegli@bernina.com", user.getEmail());
    }

    /**
     * Es wird getestet, ob die Shared-Todo Listen richtig erstellt und den Benutzern zugewiesen werden. Dies beinhaltet:
     * - Erstellen einer SharedList
     * - Hinzufügen von Benutzern
     * - Prüfen, ob Benutzer Zugriff hat
     */
    @Test
    @DisplayName("Link SharedList to User")
    public void linkSharedListToUser() {

        // Objekte werden inizialisiert
        Benutzer user1 = new Benutzer("Severin", "Bögli", "21u2119@bztf.ch");
        Benutzer user2 = new Benutzer("Timo", "Schreiber", "21u2187@bztf.ch");
        SharedList todo = new SharedList("Einkaufsliste", "Hier wird alles aufgeschrieben, was eingekauft werden soll.");

        // Benutzer werden der TODO-Liste hinzugefügt
        todo.addBenutzer(user1);

        // Der Zugriff soll in der todo und dem Benutzer ersichtlich sein.
        assertEquals(user1.getId(),todo.getUsers().get(user1.getId()).getId());

        // Prüfen, ob Benutzer Zugriff hat.
        assertFalse(todo.hasUserAccess(user2.getId()));
        assertTrue(todo.hasUserAccess(user1.getId()));
        assertFalse(user2.getSharedToDoLists().containsKey(todo.getId()));
        assertTrue(user1.getSharedToDoLists().containsKey(todo.getId()));

    }

    /**
     * Prüft, ob der Benutzer eine ID bekommt, die zwischen 100 und 1000 liegt.
     * Es werden 110 Benutzer erstellt und geprüft, ob die ID zwischen 100 und 1000 liegt.
     */
    @Test
    @DisplayName("Check User ID range")
    public void checkUserIdTest() {
        // Checks if the User ID is in the range between 100 and 1000.

        ArrayList<Benutzer> testUsers = new ArrayList<>();

        for (int i = 0; i < 110; i++) {
            testUsers.add(new Benutzer("Max","Mustermann", "max.mustermann@test.com"));
        }

        for (Benutzer user: testUsers
             ) {
            assertTrue(user.getId() >= 100 && user.getId() < 1000);
        }

    }

    /**
     * Es wird getestet, ob die ID der Aufgabe zwischen 10'000 und 100'000 liegt.
     * Es werden 60 Aufgaben erstellt und geprüft, ob die ID zwischen 10'000 und 100'000 liegt.
     * Die Aufgaben werden zusätzlich mit folgenden Parametern getestet:
     * - Aufgabe ohne Beschreibung
     * - Aufgabe mit Beschreibung
     * - Aufgabe mit Beschreibung und Bild
     */
    @Test
    @DisplayName("Check Task ID range")
    public void checkTaskIdTest() {

        ArrayList<Aufgabe> testTasks = new ArrayList<>();

        // Add Empty Tasks with Taskid in Name
        for (int i = 0; i < 20; i++) {
            testTasks.add(new Aufgabe());
        } // Checks if the id is contained in the name.
        for (int i = 0; i < 20; i++) {
            assertTrue(testTasks.get(i).getName().contains(String.valueOf(testTasks.get(i).getId())));
            assertNull(testTasks.get(i).getBild());
        }

        // Add Task with description
        for (int i = 0; i < 20; i++) {
            testTasks.add(new Aufgabe("Testaufgabe", "Dies ist eine Testaufgabe", 1, Aufgabe.Status.ONGOING));
        } // Checks if the name is right created
        for (int i = 20; i < 40; i++) {
            assertEquals("Testaufgabe", testTasks.get(i).getName());
            assertNull(testTasks.get(i).getBild());
        }

        // Add Task with description and picture
        for (int i = 0; i < 20; i++) {
            Bild bild = new Bild("C:\\Tester\\picture.png", 100,100);
            testTasks.add(new Aufgabe("Testaufgabe", "Dies ist eine Testaufgabe", 1, Aufgabe.Status.ONGOING, bild));
        } // Checks if the task contains a picture
        for (int i = 40; i < 60 ; i++) {
            assertNotNull(testTasks.get(i).getBild());
        }

        // Checks if the Task ID is between 10'000 and 100'000
        for (Aufgabe task: testTasks
             ) {
            assertTrue(task.getId() >= 10000 && task.getId() < 100000);
        }

    }

    /**
     * Es wird getestet, ob die ID der SharedListe zwischen 1'000 und 10'000 liegt.
     * Es werden 500 SharedListen erstellt und geprüft, ob die ID zwischen 1'000 und 10'000 liegt.
     */
    @Test
    @DisplayName("Check To-Do ID range")
    public void checkTodoIdTest() {

        ArrayList<SharedList> testTodos = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            testTodos.add(new SharedList("Testliste", "Dies ist die Testliste"));
        }

        // Checks if the ToDo ID is between 1'000 and 10'000
        // Checks if the Name ist always Testliste
        for (SharedList list: testTodos
        ) {
            assertEquals("Testliste", list.getName());
            assertTrue(list.getId() >= 1000 && list.getId() < 10000);
        }

    }



}
