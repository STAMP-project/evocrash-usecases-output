Analysis
========

* JIRA issue: https://jira.xwiki.org/browse/XRENDERING-422
* Even though evocrash reproduced a similar stack trace, it's not showing the real problem. The generated test simply shows that if you call an endXX() event without calling a startXXX() one then you'll end up with some NoSuchElementException caused by the pop() without a push() being done
* So the test generated by EvoCrash is not useful here.