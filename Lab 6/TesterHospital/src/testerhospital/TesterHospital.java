package testerhospital;

/**
 * @author Nicholas Vialpando
 * CS 234 - Lab 6
 * 03/04/2024
 */
public class TesterHospital {

    public static void main(String[] args) {
        //Create a Hospital
        Hospital stSarah = new Hospital();
        // Create Doctors
        Doctor vialpando = new Doctor("Vialpando");
        Doctor carter = new Doctor("Carter");
        Doctor franklin = new Doctor("Franklin");
        
        stSarah.addDoctors(vialpando);
        stSarah.addDoctors(carter);
        stSarah.addDoctors(franklin);
        
        //Create three soldiers
        Soldier rambo = new Soldier();
        rambo.setHealth(5);
        rambo.setSoldierType("Army Ranger");
        rambo.addWeapon("M4");
        rambo.addWeapon("M9");
        rambo.addWeapon("Flashbang");
        
        Soldier bad_guy_1 = new Soldier( 5, "Al queda");
        bad_guy_1.addWeapon("Machine Gun");
        bad_guy_1.addWeapon("Shotgun");
        
        Soldier bad_guy_2 = new Soldier();
        bad_guy_2.setHealth(1);
        bad_guy_2.setSoldierType("Taliban");
        bad_guy_2.addWeapon("RPG");
        
        System.out.println(rambo);
        System.out.println(bad_guy_1);
        System.out.println(bad_guy_2);
        
        rambo.shootEnemy(bad_guy_1);  // health 4
        System.out.println(bad_guy_1);
        
        rambo.shootEnemy(bad_guy_2); // health 0
        
        rambo.shootEnemy(bad_guy_1); // health 3
        rambo.shootEnemy(bad_guy_1); // health 2
        rambo.shootEnemy(bad_guy_1); // health 1
        System.out.println(bad_guy_1);
        stSarah.healPatient(bad_guy_1); // health 2
        System.out.println(bad_guy_1);
        rambo.shootEnemy(bad_guy_1); // health 1
        rambo.shootEnemy(bad_guy_1); // health 0
        stSarah.healPatient(bad_guy_1);
    }
    
}
