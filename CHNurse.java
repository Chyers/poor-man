//********************************************************************
//  CHNurse.java       Author: Cody Hyers
//
//  Due: 2/18/2024
//
// Creates the object for the nurse.
//********************************************************************

public class CHNurse extends HospitalEmployee
{
   protected String specialty;

   //-----------------------------------------------------------------
   //  Sets up this nurse with the specified information.
   //-----------------------------------------------------------------
   public CHNurse(String empName, int empNumber, String special)
   {
      super(empName, empNumber);
      specialty = special;
   }

   //-----------------------------------------------------------------
   //  Sets this nurse's specialty.
   //-----------------------------------------------------------------
   public void setSpecialty(String special)
   {
      specialty = special;
   }

   //-----------------------------------------------------------------
   //  Returns this nurse's specialty.
   //-----------------------------------------------------------------
   public String getSpecialty()
   {
      return specialty;
   }

   //-----------------------------------------------------------------
   //  Returns a description of this nurse as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      return super.toString() + "\t" + specialty;
   }

   //-----------------------------------------------------------------
   //  Prints a message appropriate for this nurse.
   //-----------------------------------------------------------------
   public void charting()
   {
      System.out.println(name + " is a " + specialty + " nurse.");
   }
}
