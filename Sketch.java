import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    /*
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
*/
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 300; intColumn++){
        
        intX = 3 + intRow*10;  
        intY = 300 + 3 + intColumn*10; 
        
      
        
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);


      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    int twoX = 0;
    int twoY = 0;

    for(int twoRow = 0; twoRow < 30; twoRow++){
      for(int twoColumn = 0; twoColumn < 300; twoColumn++){
        
        twoX = 300 + 3 + twoRow*10;  
        twoY = 300 + 3 + twoColumn*10; 

        if(twoRow%2 ==0){
          fill(255);
          noStroke();
          rect(twoX, twoY, 5, 5);
        }
        
        if(twoRow%2 !=0){
          fill(0);
          noStroke();
          rect(twoX, twoY, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    int threeX = 0;
    int threeY = 0;

    for(int threeRow = 0; threeRow < 30; threeRow++){
      for(int threeColumn = 0; threeColumn < 300; threeColumn++){
        
        threeX = 600 + 3 + threeRow*10; 
        threeY = 300 + 3 + threeColumn*10; 
        
      
        if(threeColumn%2 ==0){
          fill(255);
          noStroke();
          rect(threeX, threeY, 5, 5);
        }
        
        else{
          fill(0);
          noStroke();
          rect(threeX, threeY, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int fourX = 0;
    int fourY = 0;

    for(int fourRow = 0; fourRow < 30; fourRow++){
      for(int fourColumn = 0; fourColumn < 300; fourColumn++){
        
        fourX = 900 + 3 + fourRow*10; 
        fourY = 300 + 3 + fourColumn*10; 
      
        if(fourRow%2 == 0 && fourColumn != 0){
          fill(255);
          noStroke();
          rect(fourX, fourY, 5, 5);
        }
        
        else{
          fill(0);
          noStroke();
          rect(fourX, fourY, 5, 5);
        }
      }
    }


  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int fiveX = 0;
    int fiveY = 0;
    int fiverowCount=0;
    int fivecolumnCount=0;

    for(int fiveColumn = 30; fivecolumnCount < fiveColumn; fiveColumn--){
      for(int fiveRow = 30; fiverowCount < fiveRow; fiveRow--){
        
        fiveX = 3 - 10 + fiveRow*300/30;  
        fiveY = 3 + fiveColumn*300/30; 
        
      
        
        fill(255);
        noStroke();
        rect(fiveX, fiveY, 5, 5);


      }
      fiverowCount += 1;
    }
  }

  public void draw_section6(){
    int sixX = 0;
    int sixY = 0;
    int sixrowCount=30;
    int sixcolumnCount=0;

    for(int sixColumn = 30; sixcolumnCount < sixColumn; sixColumn--){
      for(int sixRow = 0; sixRow < sixrowCount; sixRow++){
        
        sixX =300 + 3 + sixRow*300/30; 
        sixY = 3 + sixColumn*300/30;
        
      
        
        fill(255);
        noStroke();
        rect(sixX, sixY, 5, 5);


      }
      sixrowCount -= 1;
    }
  }

  public void draw_section7(){

  }
  
  public void draw_section8(){

  }






}
