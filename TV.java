package eddu.smg;

public class TV {
int channel,volumeLevel;
boolean on= false;

TV(){
	channel =0;
	volumeLevel=0;
	
}

void turnon(){
	on=true;
}
void turnoff() {
	on=false;
}
void setChannel(int newChannel) {
	channel = newChannel;
}
void setVolume(int newVolume) {
	volumeLevel = newVolume;
}
void channelUp() {
	channel++;
}
void channelDown() {
	channel--;
}
void volumeUp() {
	volumeLevel++;
}
void volumeDown() {
	volumeLevel--;
}
}
