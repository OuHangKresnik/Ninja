mport RPi.GPIO as GPIO
import time
led = 11

GPIO.setmode(GPIO.BOARD)
GPIO.setup(led,GPIO.OUT)
#for x in range(0,100):
GPIO.output(led,True)
time.sleep(0.5)
GPIO.output(led,False)
time.sleep(0.5)
GPIO.output(led,True)
time.sleep(0.5)
GPIO.output(led,False)
time.sleep(0.5)

GPIO.output(led,True)
time.sleep(0.2)
GPIO.output(led,False)
time.sleep(0.2)

GPIO.output(led,True)
time.sleep(0.2)
GPIO.output(led,False)
time.sleep(0.2)

GPIO.output(led,True)
time.sleep(0.2)
GPIO.output(led,False)
time.sleep(0.2)
#   time.sleep(1)
#   GPIO.output(led,False)
#   time.sleep(1)
#GPIO.cleanup()
#GPIO.output(led,False)
