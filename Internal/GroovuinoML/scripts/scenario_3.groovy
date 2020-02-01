sensor "button" onPin 8
actuator "led" pin 12

state "on_l" means "led" becomes "high"
state "on_h" means "led" becomes "high"
state "off_l" means led becomes low
state "off_h" means led becomes low

initial "off_l"

from off_l to on_h when button becomes high
from on_h to on_l when button becomes low
from "on_l" to "off_h" when "button" becomes "high"
from "off_h" to "off_l" when "button" becomes "low"

export "Switch!"