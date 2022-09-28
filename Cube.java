public class Cube{

  static String[][] cube = { 
  {
      "r","r","r",
      "r","r","r",
      "r","r","r"
  },
   {
      "b","b","b",
      "b","b","b",
      "b","b","b"
  },
   {
      "o","o","o",
      "o","o","o",
      "o","o","o"
  },
   {
      "g","g","g",
      "g","g","g",
      "g","g","g"
  },
   {
      "y","y","y",
      "y","y","y",
      "y","y","y"
  },
   {
      "w","w","w",
      "w","w","w",
      "w","w","w"
  },
  };

  public void swap(String a, String b){
      String temp = a;
      a = b;
      b = temp;

  }

  public static void main(String[] args){


      String[][] temp = new String[6][9];

      for(int x = 0; x<6; x++){
          for(int y = 0; y<9; y++){
              temp[x][y] = cube[x][y];
          }
      }


    //this is a change


      String input = "u";
      switch(input){
          case "u":
              cube[0][0] = temp[3][0];
              cube[0][1] = temp[3][1];
              cube[0][2] = temp[3][2];
              break;
      }



      for(int x = 0; x<6; x++){
          for(int y = 0; y<3; y++){
              for(int z = 0; z<3; z++){
                  System.out.print(cube[x][z+y]);
              }
              System.out.println();
          }
          System.out.println();
      }
     
  }
}