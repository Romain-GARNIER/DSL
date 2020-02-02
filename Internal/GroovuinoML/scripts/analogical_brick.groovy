sensor "button" type "analog" onPin 8
actuator "led" type "analog" pin 12

state "on1" means "led" shine 100
state "on2" means "led" shine 200
state "off" means led shine 0

initial "off"

from "off" to "on1" when "button" is superior than 200
from "on1" to "off" when "button" is inferior than 200
from "on1" to "on2" when "button" is superior than 400
from "on2" to "on1" when "button" is inferior than 400

export "Switch!"