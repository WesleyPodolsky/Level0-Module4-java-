PImage creeper;     //at the top of your program
int creeperX = 350;
int creeperY = 190;
float greenness = 0;
float redness = 0;

void settings() {
size(600, 400);
}
void setup(){
PImage minecraft = loadImage("minecraft.png");     
minecraft.resize(600, 400);          
background(minecraft);


creeper=loadImage("creeper.png");  
creeper.resize(20, 40); 

}
void draw(){
greenness = 255 - dist(creeperX, creeperY, mouseX, mouseY);
redness = dist(creeperX, creeperY, mouseX, mouseY);

image(creeper, creeperX, creeperY);    
fill(redness, greenness, 0);

}
void mouseClicked(){
  ellipse(mouseX, mouseY,7,7);
  if (dist(creeperX, creeperY, mouseX, mouseY) < 10){
    fill(0,0,0);
    text("you won!", 100, 50); }
}