1. Raspberry Pi 2B has 1 GB Ram; 40 GPIO pins  
2. "cat /proc/cpuinfo", you can see it uses 4 ARM v7 processors  
3. GPIO: the input/output pin of Raspberry Pi GPIO is rated at 3.3V, so be careful when you want to use it as input. 
4. 


Term:  
SCM: single chip microcoputer  
GPIO: General-purpose input/output  
RXD: Receive Data  
TXD: Transmit Data  
I2C: Inter-Integrated Circuit, a multi-master, multi-slave, single-ended, serial computer bus.  
  - SCL: clock line
  - SDA: data line
UART: Universal Asynchronous Receiver/Transmitter. It takes bytes of data and transmits the individual bits in a sequential fashion  
  - can be used as communication between microcontrollers  
SPI: Serial Peripheral Interface Bus. A synchronous serial communication interface. Typical applications include Secure Digital cards and liquid crystal display Serial Peripheral Interface Bus. A synchronous serial communication interface. Typical applications include Secure Digital cards and liquid crystal displays. It specifies 4 logic signals:
  - SCLK: serial clock (output from master)
  - MOSI: Master Output, Slave Input
  - MISO: Master Input, Slave Output
  - SS: Slave Select  
VCC: Volt Current Condenser which is positive, GND is the corresponding negative.
  - For 99% uses, v+ == Vcc, unless you are working with a multiple rail circuit
