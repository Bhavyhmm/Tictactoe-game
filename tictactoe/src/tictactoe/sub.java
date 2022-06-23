
package tictactoe;

/**
 *
 * @author Bhavy
 */
public class sub {
    int[][] board=new int[][]{
        {0,0,0},
        {0,0,0},
        {0,0,0}
    
    };
    
    
    public void playx(int row,int col){
        board[row][col]=1;
    }
    public void playo(int row,int col){
        board[row][col]=-1;
    }
    public boolean isBlank(int row,int col){
        //Method 1
        //if(board[row][col]==0){
          //  return true;
        //}else
        //{
          //  return false;
        //}
        return (board[row][col]==0);
    }
    public void display(){
        System.out.println("__________________");
       for(int row=0;row<3;row++){
           System.out.print("| ");
           for(int col=0;col<3;col++){
              String str=" ";
              if(board[row][col]==1)
                  str="x";
              if(board[row][col]==-1)
                  str= "0";
              System.out.print(str+" | ");
           }
           System.out.println();
           System.out.println("________________");
       }
       
    }
    public boolean isOver(){
        return  xWon() || oWon();
    }
    public boolean xWon(){
      for(int row=0;row<3;row++){
          if(board[row][0]==1 && board[row][1]==1 && board[row][2]==1 ){
              System.out.println("x wins");
              return true;
              
             
          }
      }
      
      for(int col=0;col<3;col++){
          if(board[0][col]==1 && board[1][col]==1 && board[2][col]==1 ){
              System.out.println("x wins");
              return true;
              
              
              
             
          }
          
       if((board[0][0]==1 && board[1][1]==1 && board[2][2]==1) ||(board[0][2]==1 && board[1][1]==1 && board[2][0]==1))
       {
          System.out.println("x wins");
          return true;
       }
      
    }
   
      
 return false;  
}
    
     public boolean oWon(){
      for(int row=0;row<3;row++){
          if(board[row][0]==-1 && board[row][1]==-1 && board[row][2]==-1 ){
              System.out.println("o wins");
              return true;
             
          }
      }
      
      for(int col=0;col<3;col++){
          if(board[0][col]==-1 && board[1][col]==-1 && board[2][col]==-1 ){
              System.out.println("o wins");
              return true;
              
             
          }
          
          
          if((board[0][0]==-1 && board[1][1]==-1 && board[2][2]==-1) || (board[0][2]==-1 && board[1][1]==-1 && board[2][0]==-1))
       {
          System.out.println("x wins");
          return true; 
       }
      
    }
   
  return false;    
   
}
     
public boolean isFull(){
    boolean isfull=true;
    for(int row=0;row<3;row++){
        for(int col=0;col<3;col++){
            
            if (board[row][col]==0) {
                 
                 return false;
                   
                }
            
        }
    }
    return isfull;
    
}
    
    
    
}
    
