PImage tail;     //at the top of your program


void settings() {
size(600, 400);
}
void setup(){
PImage donkey = loadImage("donkey.png");     
donkey.resize(600, 400);          
background(donkey);


tail=loadImage("tail.png");  
tail.resize(100, 200); 

}
void draw(){


}
void mouseClicked(){
  image(tail, mouseX, mouseY);    
}