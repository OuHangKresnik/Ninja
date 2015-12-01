1. Initially I have no keyboard, so I have to use ssh for remote login.
  - If you don't have a screen as well, and your raspberry is connected to the same rooter as your mac, then you can try to use nmap: nmap 192.168.0.\* -p 22 to search all machines which has opened port 22 (for ssh), then you can try: ssh user@ipAddressYouFind
    - brew install nmap    
  - If you have a screen, actually you can find the ip address by move your mouse to the connection icon on right upper side.  
