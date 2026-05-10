static final int WIDTH = 800;
static final int HEIGHT = 600;
PImage face;    
      

     
    
public void setup() {
      face = loadImage("face.png");
      size(800, 600);
      face.resize(800,600);
      
      
}

public void draw() {
         image(face, 0, 0); 
         fill(255,255,255);
      ellipse(270,270,120,120);     
      ellipse(560,270,120,120);   
          fill(0,0,0);
      ellipse(270,270,40,40);     
      ellipse(560,270,40,40); 
}
