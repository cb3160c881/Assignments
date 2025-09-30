package language.basics;

public class ArrayAssignment {

	public static void main(String[] args) {

		String[][][] results = new String[5][6][2];

        // Semester 1
        results[0][0][0] = "Mathematics I";      
        results[0][1][0] = "Physics"; 
        results[0][2][0] = "Chemistry"; 
        results[0][3][0] = "Computer Programming";
        results[0][4][0] = "Engineering Drawing"; 
        results[0][5][0] = "Basic Electrical Eng."; 
        
        results[0][0][1] = "Pass(78)";
        results[0][1][1] = "Pass(85)";
        results[0][2][1] = "Fail(21)";
        results[0][3][1] = "Pass(74)";
        results[0][4][1] = "Pass(88)";
        results[0][5][1] = "Pass(79)";

        // Semester 2
        results[1][0][0] = "Mathematics II"; 
        results[1][1][0] = "Mechanics"; 
        results[1][2][0] = "Environmental Sci."; 
        results[1][3][0] = "Basic Electronics"; 
        results[1][4][0] = "Engineering Physics"; 
        results[1][5][0] = "Engineering Graphics"; 
        
        results[1][0][1] = "Pass(82)";
        results[1][1][1] = "Pass(77)";
        results[1][2][1] = "Pass(93)";
        results[1][3][1] = "Fail(19)";
        results[1][4][1] = "Fail(24)";
        results[1][5][1] = "Pass(90)";

        // Semester 3
        results[2][0][0] = "results Structures";    
        results[2][1][0] = "Discrete Mathematics"; 
        results[2][2][0] = "Digital Electronics"; 
        results[2][3][0] = "Operating Systems";
        results[2][4][0] = "Signals and Systems"; 
        results[2][5][0] = "Object-Oriented Prog."; 
        
        results[2][0][1] = "Pass(88)";
        results[2][1][1] = "Pass(81)";
        results[2][2][1] = "Pass(76)";
        results[2][3][1] = "Fail(32)";
        results[2][4][1] = "Pass(85)";
        results[2][5][1] = "Pass(78)";

        // Semester 4
        results[3][0][0] = "Algorithms";  
        results[3][1][0] = "Computer Networks"; 
        results[3][2][0] = "resultsbase Systems"; 
        results[3][3][0] = "Microprocessors";  
        results[3][4][0] = "Communication Eng.";
        results[3][5][0] = "Software Engineering"; 
        
        results[3][0][1] = "Pass(91)";
        results[3][1][1] = "Pass(73)";
        results[3][2][1] = "Fail(19)";
        results[3][3][1] = "Pass(80)";
        results[3][4][1] = "Pass(76)";
        results[3][5][1] = "Pass(87)";

        // Semester 5
        results[4][0][0] = "Probability & Stats"; 
        results[4][1][0] = "Machine Learning"; 
        results[4][2][0] = "Compiler Design"; 
        results[4][3][0] = "Theory of Computation"; 
        results[4][4][0] = "Embedded Systems"; 
        results[4][5][0] = "Computer Graphics";  
        
        results[4][0][1] = "Pass(86)";
        results[4][1][1] = "Pass(88)";
        results[4][2][1] = "Pass(84)";
        results[4][3][1] = "Pass(95)";
        results[4][4][1] = "Pass(73)";
        results[4][5][1] = "Pass(90)";

       
        System.out.println("Semester 2 Subject 4: " + results[1][3][0]);
        System.out.println("Semester 2 Subject 5: " + results[1][4][0]);

        System.out.println("Semester 4 Subject 3 Marks: " + results[3][2][1]);
        System.out.println("Semester 4 Subject 6 Marks: " + results[3][5][1]);
		 
		
		
	}

}
