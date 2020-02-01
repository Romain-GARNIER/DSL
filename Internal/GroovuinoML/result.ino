// Wiring code generated from an ArduinoML model
// Application name: Switch!

void setup(){
  pinMode(8, INPUT);  // button [Sensor]
  pinMode(12, OUTPUT); // led [Actuator]
  pinMode(13, OUTPUT); // buzzer [Actuator]
}

long time = 0; long debounce = 200;

void state_off_l() {
  digitalWrite(12,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_buzzer_on_h();
  } else {
    state_off_l();
  }
}

void state_off_h() {
  digitalWrite(12,LOW);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == LOW && guard ) {
    time = millis();
    state_off_l();
  } else {
    state_off_h();
  }
}

void state_buzzer_on_l() {
  digitalWrite(13,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_led_on_h();
  } else {
    state_buzzer_on_l();
  }
}

void state_buzzer_on_h() {
  digitalWrite(13,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == LOW && guard ) {
    time = millis();
    state_buzzer_on_l();
  } else {
    state_buzzer_on_h();
  }
}

void state_led_on_l() {
  digitalWrite(13,LOW);
  digitalWrite(12,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == HIGH && guard ) {
    time = millis();
    state_off_h();
  } else {
    state_led_on_l();
  }
}

void state_led_on_h() {
  digitalWrite(13,LOW);
  digitalWrite(12,HIGH);
  boolean guard = millis() - time > debounce;
  if( digitalRead(8) == LOW && guard ) {
    time = millis();
    state_led_on_l();
  } else {
    state_led_on_h();
  }
}

void loop() {
  state_off_l();
}

