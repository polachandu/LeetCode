//You are given coordinates, a string that represents the coordinates of a square of the chessboard. 
//Below is a chessboard for your reference.
//Return true if the square is white, and false if the square is black.
//The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.
//
//Example 1:
//Input: coordinates = "a1"
//Output: false
//Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.

//Example 2:
//Input: coordinates = "h3"
//Output: true
//Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.

//Example 3:
//Input: coordinates = "c7"
//Output: false
public class DetermineColorOfAChessboardSquare {
	
	
	public static boolean squareIsWhite(String coordinates) {
	        if((int)coordinates.charAt(0)%2 != 0 && coordinates.charAt(1)%2 != 0) {
	        	return false;
	        }else if((int)coordinates.charAt(0)%2 == 0 && coordinates.charAt(1)%2 != 0) {
	        	return true;
	        }else if((int)coordinates.charAt(0)%2 != 0 && coordinates.charAt(1)%2 == 0) {
	        	return true;
	        }else {
	        	return false;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareIsWhite("a1"));
		System.out.println(squareIsWhite("h3"));
		System.out.println(squareIsWhite("c7"));


	}

}
