int y=0;
int randomNumber=250;
int score = 0;
void setup() {
size(500,500);
}

void draw() {
  if (y==500) {
  randomNumber = (int) random(500);
  y=0;
}
background(200,200,200);
fill(100,100,100);
noStroke();
rect(mouseX, 450, 50, 50);
fill(0, 0, 150);
stroke(0, 0, 200);
ellipse(randomNumber, y, 10, 20);
y+=5;
if (y==450){
  checkCatch(randomNumber);
}
fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}

void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
