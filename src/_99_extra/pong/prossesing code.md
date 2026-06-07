float ballX = 300;
float enemyY = 200;
float ballY = 200;
float ballSpeedY = 1;
float ballSpeed = 3;


void setup(){
size(600,400);
}

void draw(){
  clear();
  ellipse(ballX, ballY, 20, 20);
  rect(540, mouseY-25, 10,50);
  rect(60, enemyY-25, 10,50);
  ballX += ballSpeed;
  ballY += ballSpeedY;
  if(ballY > 387 || ballY < 13){
    ballSpeedY = -ballSpeedY;
  }
  if(ballX > 527 && ballX < 535 + abs(ballSpeed) ){
    if(ballY > mouseY - 25 && ballY < mouseY+25){
      ballSpeed = -ballSpeed;
      if(ballSpeed > 0){
      ballSpeed += 0.5;
      }
      else{
      ballSpeed -= 0.5;
      }
      if(ballSpeedY > 0){
      ballSpeedY += 0.5;
      }
      else{
      ballSpeedY -= 0.5;
      }
    }}
    
   if(ballX > 60 && ballX < 80){
    if(ballY > enemyY - 25 && ballY < enemyY+25){
      ballSpeed = -ballSpeed;
      if(ballSpeed > 0){
      ballSpeed += 0.5;
      }
      else{
      ballSpeed -= 0.5;
      }
      if(ballSpeedY > 0){
      ballSpeedY += 0.5;
      }
      else{
      ballSpeedY -= 0.5;
      }
    }}
    
  if(ballY > enemyY){
  enemyY += abs(ballSpeed)/1.5;
  }
  if(ballY < enemyY){
  enemyY -= abs(ballSpeed)/1.5;
  }
  
  
  if(ballX > 600 || ballX < 0){
    ballSpeed = 2;
    ballSpeedY = 1;
    ballX = 300;
    ballY = 200;
    enemyY = 200;
  }
  


   
  
}