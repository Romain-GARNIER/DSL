sensor "button_1" onPin 12
sensor "button_2" onPin 10
actuator "led" pin 8

state "on" means "led" becomes "high"
state "off" means led becomes low

initial "off"

from "off" to "on" when "button_1" becomes "high"
from "on" to "off" when "button_2" becomes "high"
error 4 from "on" when "button_1" becomes "high" and "button_2" becomes "high"
error 3 from "off" when "button_1" becomes "high" and "button_2" becomes "high"

export "Switch!"