int XPos= 10;
int speedX = 10;
import ddf.minim.*;
boolean soundPlayed = false;
void setup() {
    size(800,200);
}
void draw() {
  background(29,137,19);
  fill(19,232,237);
  ellipse(XPos, 100, 100,100);
  if(mousePressed) {
    XPos += speedX;
    speedX += 5;
  }
  if (XPos >=800){
    playSound();
}
}
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding2.wav");
        sound.trigger();
        soundPlayed = true;
    }
}