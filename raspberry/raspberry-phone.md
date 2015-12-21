1. The hardwares: Raspberry Pi 2B, DIYmall SIM808 Module with GPS and GSM Antenna  
2. The module has TTL serial interface which is UART  
3. UART appears as /dev/ttyAMA0 under Linux.  
  - Initially, when the module connects to Raspberry, there is no ttyAMA0 show up.  
  - Edit: /boot/cmdline.txt, delete "console=ttyAMA0,115200" and "kgdboc=ttyAMA0,115200".  
  - Because the kernel will use the port. "console" outputs messages during boot and "kgdboc" enables kernel debugging.  
  - "console" tells kernel to assume the UART as a system console  
  - According to linux RPI Serial Connection tutorial, should change another file "/etc/inittab", while I didn't find it.  
  - "ps aux | grep ttyAMA0" see the port condition  
  - "sudo usermod -a -G dialout pi"  
  - "stty -F /dev/ttyAMA0": see configuration of a port  
    - it showed "speed 9600 baud; line = 0;min = 1; time = 5;"  
  - http://elinux.org/RPi\_Serial\_Connection  
  - minicom is a simple tool for testing: sudo apt-get install minicom # minicom -b 9600 -o -D /dev/ttyAMA0  
    - it showed "offline" and no response  
  - 
4. Python Serial Port Programming: http://www.elinux.org/Serial\_port\_programming  
