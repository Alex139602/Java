package Solution.WorkingWithMoney;

public class Money {
	
	private int pence, pounds;
	private boolean validMoney;

    public int getPence() { return pence; }
    public int getPounds() { return pounds; }
    public boolean getValidMoney() { return validMoney; }
    
    // Part 1 When pence only
    /*
    public Money(int pennies) {
      pence = pennies;
      validMoney = (pennies >= 0 && pennies < 100);
    }

    public void addMoney(int pennies) {
      if (!getValidMoney()) return;
      // object is currently valid
      if (pennies >= 0 && pennies < 100)
      {
        pence += pennies;
        return;
      }

      validMoney = false; 
      

    }

    public void subtractMoney(int pennies) {
      if (!getValidMoney()) return;
      // object is currently valid
      if (pennies >= 0 && pennies < 100)
      {
        pence -= pennies;
        if (pence < 0)
        {
          validMoney = false;
        }
        return;
      }
      // pennies were invalid
      validMoney = false;
    }

    public String getCurrentMoney() {
      
        if (!getValidMoney())
        {
          return "Error";
        }
        
        int pounds = this.pence / 100;
        int pence = this.pence % 100;
        
        return String.format("£%d.%02d", pounds, pence);

    }
     */

    // Part 2 - Introducing pounds
    public Money(int pounds, int pence) {
      this.pounds = pounds;
      this.pence  = pence;
      validMoney = (pounds >= 0 && pence >= 0 && pence < 100);
    }

    public void addMoney(int pounds2, int pence2) {
      if (!getValidMoney()) return;
      // object is currently valid
      if (pounds2 >= 0 && pence2 >= 0 && pence2 < 100)
      {
        pounds += pounds2;
        pence += pence2;
        if (pence >= 100)
        {
          pence -= 100;
          pounds++;
        }
      }
      else // parameters not valid
      {
        validMoney = false;
      }
    }

    public void subtractMoney(int pounds2, int pence2) {
      if (!getValidMoney()) return;
      // object is currently valid
      if (pounds2 >= 0 && pence2 >= 0 && pence2 < 100)
      {
        // parameters were fine
        if ((pounds * 100 + pence) < (pounds2 * 100 + pence2))
        {
          validMoney = false; // can't have negative money
          return;
        }
        // Existing money is currently larger than parameters
        pounds -= pounds2;
        pence  -= pence2;
        // normalise as Pence could be negative
        if (pence < 0)
        {
          pounds--; // borrowing a pound gives us an extra 100p
          pence += 100;
        }
      }
      else // parameters were not valid
      {
        validMoney = false;
      }
    }

    public String getCurrentMoney() {

      
        if (!getValidMoney())
        {
          return "Error";
        }

        return String.format("£%d.%02d", pounds, pence);
      

    }
    
}
