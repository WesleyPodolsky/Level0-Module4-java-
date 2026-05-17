PImage waldo;

void settings() {
size(600,400);
waldo = loadImage("waldo.jpg");
waldo.resize(600,400);
}
void setup(){
image(waldo, 0 ,0);

}
void draw(){
}

void mouseClicked(){
println("X: " + mouseX + " Y: " + mouseY);
if(mouseX > 390 && mouseX < 420){
 if(mouseY < 245 && mouseY > 205){
  fill(0);
  text("you found waldo!", 353, 300);
  println("clickWorked");
}}
}