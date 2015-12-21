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
3. Use "git log" you can see all commits for this branch
4. git remote set-url origin https://OuHangKresnik@github.com/OuHangKresnik/Ninja.git
5. remove tracked files from git: git rm -r --cached \*.class
6. Count how many lines in files within one repo: git ls-files | xargs cat | wc -l
