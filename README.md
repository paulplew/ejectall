# ejectall

Quick dirty Automation to be used in CLI that ejects all external drives.
> Working on 10.15.7 and later 

### How to Install
1. Clone the repo and cd into it
2. Echo the path to your $PATH
``` Bash
export PATH=`pwd`:$PATH
```
To add the path on every session, add the following to your `.bashrc` replacing PATH_TO_DIRECTORY with the path to the directory:
``` Bash
export PATH=$PATH_TO_DIRECTORY:$PATH
```
3. Eject your disks, its **EASY** :
```
ejectall
```

If you like this automation consider dropping a :star:
