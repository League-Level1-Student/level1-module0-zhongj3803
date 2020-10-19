PImage pictureOfRecord;
int angle=0;
Minim minim;  
AudioPlayer song;
import ddf.minim.*;
void setup() {
  minim = new Minim(this);
  song = minim.loadFile("awesomeTrack.mp3", 512);
  size(600,600);                                 
  pictureOfRecord = loadImage("record.png");
  pictureOfRecord.resize(600,600);
}

void draw() {
  background(200,200,200);
  if (mousePressed){
  angle+=4;
  song.play();
  rotateImage(pictureOfRecord,angle);
  image(pictureOfRecord, 0, 0);
  }
  else {
    song.pause();
  }
}

void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
