# MacVim
## Install: 
	brew install macvim
	brew link macvim

+ Install pathogen.vim to make install plugins and runtime files easier
	Follow the instructions: https://github.com/tpope/vim-pathogen
	Initially you don't have the ~/.vimrc file and you will need to create one.

+ Install MERD Tree for MacVim
	Tried to install it without pathogen while it shows a bunch of errors while start the vim:__
		mkdir ~/.vim/plugin__
		git clone https://github.com/scrooloose/nerdtree.git__
	The correct way after installed pathogen:__
		go to ~/.vim/bundle__
		git clone https://github.com/scrooloose/nerdtree.git__
		Restart vim__
		(Instructions from: https://github.com/scrooloose/nerdtree)__
+ Install Vundle following: https://github.com/VundleVim/Vundle.vim
+ Install UltiSnips following: https://github.com/SirVer/ultisnips after installed Vundle
+ Notice, you should make sure the system are using macvim instead of the original one__
	Basically you will need to add:__
	alias vi='/Applications/MacVim.app/Contents/MacOS/Vim'__
	alias vim='/Applications/MacVim.app/Contents/MacOS/Vim'__
	alias gvi='/Applications/MacVim.app/Contents/MacOS/Vim -g'__
	to your ~/.bash_profile
