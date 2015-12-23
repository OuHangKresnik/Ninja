1. Initially I have no keyboard, so I have to use ssh for remote login.
  - If you don't have a screen as well, and your raspberry is connected to the same rooter as your mac, then you can try to use nmap: nmap 192.168.0.\* -p 22 to search all machines which has opened port 22 (for ssh), then you can try: ssh user@ipAddressYouFind
    - brew install nmap    
  - If you have a screen, actually you can find the ip address by move your mouse to the connection icon on right upper side.
2. Install the touch screen
  - Followed the instruction:
    - sudo apt-get update # sudo apt-get upgrade # sudo reboot
    - cd /boot/overlays # sudo rm mz61581-overlay.dtd # sudo wget http://www.itontec.com/mz61581-overlay.dtd # sudo reboot
    - sudo nano /boot/config.txt # add "dtparam=spi=on" and "dtoverlay=mz61581" into this file
    - but, there is no /user/share/X11/xorg.conf.d/99-fbturbo.conf
    - remember to plugin the screen in the right direction, otherwise, it won't event light up
    - "sudo REPO\_URI=https://github.com/notro/rpi-firmware rpi-update", to install the latest fbtft kernel and modules. 
    - fbtft is Linux Framebuffer drivers for small TFT LCD display moduels   
    - the next problem is there is no GUI showing up, just command line. Temp Solution: "sudo FRAMEBUFFER=/dev/fb1 startx"
    - found error in "dmesg": spi\_master spi0: spi\_device register error /soc/spi@7e204000/pitft\_ts@1, and find the past instructions for pitft from /boot/cmdline.txt, and delete them will solve this problem 
  - Calibration:
    - sudo apt-get install libtool libx11-dev xinput autoconf libx11-dev libxi-dev x11proto-input-dev
    - git clone https://github.com/tias/xinput\_calibrator
    - cd xinput\_calibrator/
    - ./autogen.sh
    - make
    - sudo make install
    - cd ~
    - wget http://s3.amazonaws.com/ttbox/xinput\_calibrator\_pointercal.sh
    - sudo cp ~/xinput\_calibrator\_pointercal.sh /etc/X11/Xsession.d/xinput\_calibrator\_pointercal.sh
    - sudo sh -c ‘echo “sudo /bin/sh /etc/X11/Xsession.d/xinput\_calibrator\_pointercal.sh” >> /etc/xdg/lxsession/LXDE-pi/autostart’

3. All logs are in /var/log
4. Virtual Network Computing system enables us to interact with GUI of Raspberry Pi using your desktop PC
  - sudo apt-get install tightvncserver
  - install TightVNC viewer on your computer
5. WiringPi(http://wiringpi.com) is an Arduino wiring-like library in C with many other language wrapper for Pi.
6. BCM mode VS BOARD mode in GPIO:
 The GPIO.BOARD option specifies that you are referring to the pins by the number of the pin in the plug. i.e. the number printed on the board
 The GPIO.BCM means you are referring by "Broadcom SOC channel". Because my Raspberry uses Broadcom BCM2836 chip which is built with 4 ARM cores.  

7. About Wireless tool library.  
The command "iwconfig" shows all information of wifi. Actually we can find the source code of this command to see how to do similar program using c or c++. cfg80211 is the Linux 802.11 configuration API which replaces Wireless-Extensions. nl80211 is the new 802.11 netlink interface public header. Together with cfg80211 it is intended to replace Wireless-Extensions.  

