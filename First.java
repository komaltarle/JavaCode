class first
{
	public static void main(String args[])
	{
	
		System.out.println(welcome);

	

	}
}


Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice
$ git init
Initialized empty Git repository in D:/GitPractice/.git/

Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git --version
git version 2.46.2.windows.1

Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git config --global user.name "komal"

Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git config --global user.email "tarlekomal2511@gmail.com"

Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git config --list
diff.astextplain.textconv=astextplain
filter.lfs.clean=git-lfs clean -- %f
filter.lfs.smudge=git-lfs smudge -- %f
filter.lfs.process=git-lfs filter-process
filter.lfs.required=true
http.sslbackend=openssl
http.sslcainfo=C:/Program Files/Git/mingw64/etc/ssl/certs/ca-bundle.crt
core.autocrlf=true
core.fscache=true
core.symlinks=false
pull.rebase=false
credential.helper=manager
credential.https://dev.azure.com.usehttppath=true
init.defaultbranch=master
user.name=komal
user.email=tarlekomal2511@gmail.com
core.repositoryformatversion=0
core.filemode=false
core.bare=false
core.logallrefupdates=true
core.symlinks=false
core.ignorecase=true

Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        First.java

nothing added to commit but untracked files present (use "git add" to track)

Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git add First.java

Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   First.java


Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git add second.java
fatal: pathspec 'second.java' did not match any files

Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git add Second.java
fatal: pathspec 'Second.java' did not match any files

Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   First.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Second.java.java
        Third.java.java


Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git add Second.java
fatal: pathspec 'Second.java' did not match any files

Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   First.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Second.java
        Third.java


Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git add Second.java

Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   First.java
        new file:   Second.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Third.java


Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git add -A

Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   First.java
        new file:   Second.java
        new file:   Third.java


Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   First.java
        new file:   Second.java
        new file:   Third.java

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   First.java


Lenovo@LAPTOP-KV6N77OC MINGW64 /d/GitPractice (master)
