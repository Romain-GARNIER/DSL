sensor "button" onPin 8
actuator "led" pin 12
actuator "buzzer" pin 13

state "off_l" means "led" becomes "low"
state "off_h" means "led" becomes "low"
state "buzzer_on_l" means "buzzer" becomes "high"
state "buzzer_on_h" means "buzzer" becomes "high"
state "led_on_l" means "buzzer" becomes "low" and "led" becomes "high"
state "led_on_h" means "buzzer" becomes "low" and "led" becomes "high"

initial "off_l"

from "off_l" to "buzzer_on_h" when "button" becomes "high"
from "buzzer_on_h" to "buzzer_on_l" when "button" becomes "low"
from "buzzer_on_l" to "led_on_h" when "button" becomes "high"
from "led_on_h" to "led_on_l" when "button" becomes "low"
from "led_on_l" to "off_h" when "button" becomes "high"
from "off_h" to "off_l" when "button" becomes "low"

export "Switch!"