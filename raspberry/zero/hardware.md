1. PWM driver (Pulse Width Modulation) 16-channel, 12-bit
  - Used to encode a message into a pulsing signal  
  - Its main use is to allow the control of the power supplied to electrical devices  
  - Especially to inertial loads such as motors; control dimming/brightness of RGB LEDs or control the direction of a servo motor  
  - It's VCC, SDA and SCL connects to V5, SDA and SCL of Raspberry Pi (I2C)   
  - In python, "import smbus" to control I2C

2. On the obstacle avoid IR module, the "EN" means "enable", which doesn't need connect. Also, there is resistor that you can change its value.

3. MJPEG: Motion JPEG: A video compression format in which each video frame of interlaced field of a digital video sequence is compressed separately as a JPEG image.
  - Used by video capture devices such as IP cameras, webcams and digital cameras  
  - Natively supported by web browsers  
  - MJPEG over HTTP streaming separates each image into individual HTTP replies on a specified marker. A special mime-type content type informs the client to expect several parts as an answer delimited by <boundary-name>, the TCP connection is not closed as long as the client wants to receive new frames and the server wants to provide new frames.

4. How to choose a camera for your robot: http://robotsforroboticists.com/camera-lens-selection/
  - Resolution: The classic resolution is based on pixels, such as 600p * 400p. Another important one is spatial resolution: how close the pixels are to each other; how many pixels-per-inch is on the sensor.  
  - Focal Length: smaller focal length will be zoomed out and you will see a larger picture.If it's specified as a range, then it probably is an adjustable zoom lens. An extreme case is a small focal length can be a fish-eye lens that can see around 180 with a distorted image.  
  - Maximum Aperture or f number: it's often specified as f/2.8 or F2.8. The larger the number the less light can enter into the aperture. If you need to take images in low light condition you will need a small f number to avoid needing external lighting  
  - FOV (Field of View): the angular measurement window that can be seen by lens. It's specified with two numbers such as 60\*90, where 60 is horizontal and 90 is vertical FOV. Sometimes ppl give 1 number based on the diagonal  
  - With all lenses, particular with cheaper lenses, distortion and vignetting can be a big problem (distortion are where X or Y axis appears to no longer be straight and perpendicular with each other; vignetting are where corners and edges become darkened)  
