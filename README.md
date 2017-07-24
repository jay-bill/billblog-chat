# 基于WebSocket Stomp的模拟简单的一对一聊天室
用法：<br>
1、运行Application类；<br>
2、在浏览器打开一个新标签，输入localhost:8080/index1.html；<br>
3、再打开一个新的标签，输入localhost:8080/index2.html；<br>
4、这时候，任选一个页面发送消息，另一个页面就可以收到。<br>
<br>
修改的方法：<br>
如果想移植到具体项目中，可以通过只保留一个html，然后动态的修改html页面下两个隐藏域：uid和toid；<br>
这时候，如果对方在线，就可以发送数据了。
结束！
