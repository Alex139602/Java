package Solution.NINumbers;

public enum CrownDependency {

	Guernsey, 
	IsleOfMan, 
	Jersey, 
	None  // just in here so that we don't have to throw 
          // any exceptions if anyone asked for the 
          // (get)CrownDependency of any invalid NI number
	      // or ran that method on a valid NI number without
	      // first asking if it is a (is)CrownDependency 

}
