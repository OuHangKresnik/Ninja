1. When I'm creating a new directory "note" with my first note file, I tried:
	git add ./macvim
	git commit -a
	git push origin master
   And it doesn't work. Then I tried:
	git add -all
	git status
	git commit -m "Changelist description"
	git push origin master
   This time it works
2. After "git commit", the old system vim came out instead of macvim
	git config --global core.editor "vim"
	Open ~/.bash_profile and add:
		export GIT_EDITOR='/Applications/MacVim.app/Contents/MacOS/Vim'
   It works.
