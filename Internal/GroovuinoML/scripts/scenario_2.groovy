sensor "button_1" onPin 8
sensor "button_2" onPin 10
actuator "led" pin 12

state "on" means "led" becomes "high"
state "off" means led becomes low

initial "off"

from "off" to "on" when "button_1" becomes "high"
from "on" to "off" when "button" becomes "low"

export "Switch!"