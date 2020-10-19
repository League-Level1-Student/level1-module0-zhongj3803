int randomX=0;
int randomY=0;
void setup() {
size(500,500);
}

void draw() {
  background(200,200,200);
  makeMagical();
  for (int i = 0; i<300;i++){
     fill(frameCount,i,23);
    ellipse(getWormX(i),getWormY(i),5,5);
  }
}

 float frequency = 0.001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
