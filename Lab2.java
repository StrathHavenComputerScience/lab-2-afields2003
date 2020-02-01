public class Lab2
{
   public static void checkerAisle(){
       for(int i=0;i<4;i++){
           Robot.makeDark();
           Robot.move();
           if(i<3){
           Robot.move();  
        }
        }
    }
   public static void turnRight(){
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.turnLeft();
    }
  public static void darkenAisle(){
      turnRight();
      for(int i=0;i<6;i++){
      Robot.makeDark();
      Robot.move();
    }
    Robot.makeDark();
    Robot.turnLeft();
    Robot.turnLeft();
      for(int i=0;i<6;i++){
          Robot.move();
        }
        turnRight();
    }
  public static void lightAisle(){
      Robot.move();
      for(int i=0;i<5;i++){
          Robot.makeLight();
          Robot.move();
        }
      
   }
   
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    
    //INSERT CODE HERE
    for(int i=0;i<4;i++){
        lightAisle();
        Robot.turnLeft();
    }
  }
  
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
    //INSERT CODE HERE
    for(int i=0;i<5;i++){
    darkenAisle();
    if(i<4){
    Robot.move();
    Robot.makeDark();
    Robot.move();
    }
  }
  }
  
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    
    //INSERT CODE HERE
    for(int i=0;i<5;i++){
     if(Robot.frontIsClear()){
    checkerAisle();
    turnRight();
    Robot.move();
    turnRight();
    checkerAisle();
    Robot.turnLeft();
    Robot.move();
    Robot.turnLeft();
}
}
  }
}
