## Go [here](https://docs.google.com/document/d/1lJ0uA1lQpHq9C4dUnjdfuViNASwv0Si_S6sxvO_DHx4/edit#heading=h.nhr8ma6gr210) for questions to study for Monday.

# Revature Batch May 26th, 2020
A collection of the demos/notes for the Revature Online Certification Program on 5/26/20
### Click [here](https://docs.google.com/presentation/d/1W5W4d1Ey0VXYf0ss6Zx5Ryh0_xMLAb3elNAKMu7b_JQ/edit?usp=sharing) for our lecture slides.

## Useful Links
* [Git Cheat Sheet](https://www.git-tower.com/blog/git-cheat-sheet)
* [Git Basics](https://youtu.be/0fKg7e37bQE)
* [Git Team Basics](https://youtu.be/oFYyTZwMyAg)
* [Hacker Rank](https://www.hackerrank.com/)
  * Good source of practice. Use it often for practice.
  * We will hold a [contest](https://www.hackerrank.com/alpha-java-practice) within the batch to practice Java
  * There will also be [another contest](https://www.hackerrank.com/battle-of-the-batches)
    *  This will be a competition between our batch and another
    * This will be a real challenge

## Environment Setup
* [github](https://github.com)
  * www.github.com
  * Create an account
  * We will use this for version control & class examples
  * We will be leveraging GitHub Classroom for submission of your projects & assignments
    * https://classroom.github.com/classrooms/65731233-200526-rocp-alpha-classroom
    * Link your GitHub account to your name in the classroom

* [Slack](https://slack.com)
  * www.slack.com
  * Create a slack account
  * We will use this for communications between the group inside & outside of work hours
  * https://join.slack.com/t/200526-rocp-alpha/shared_invite/zt-eu4y7ink-v1WzVPTgp1sIuNVUI_AhcA
    * Please display your first and last name.  

* [Scoop](https://scoop.sh/)
  * Windows package manager
  * Can optionally be used to setup environment for you
  * Leverage the [install](scripts/install.ps1) Powershell Script
    * You may customize as needed, such as removing Java or STS if already installed

#### The following can be installed with scoop if desired. Otherwise, leverage these links.
* [GIT](https://git-scm.com/downloads)

* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
  * x64 for 64 bit systems, x86 for 32 bit systems
  * Set environment variables
    * Set `PATH` to have directory of `bin` folder for JDK (eg ..`\Java\jdk_version\bin`)
    * Set `JAVA_HOME` to `\java\jdk_version`

* [Java IDE - Spring Tool Suite](https://spring.io/tools)
  * Make sure you get the version that corresponds to your operating system! (eg 64 bit vs 32 bit)

* [Maven](https://maven.apache.org/download.cgi)
  * Extract to your C drive (Download the latest maven version that is a bin.zip)
  * After extracting, set the following environment variables
    * Set `M2_HOME` to the root folder of maven
    * Set `M2` to `%M2_HOME%\bin`
    * Add `%M2%` to your `PATH` variable
