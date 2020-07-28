*Git使用教程*

* **GIT的安装** 
 
  [Windows](https://www.cnblogs.com/wj-1314/p/7993819.html)
 
  [Linux](https://www.jianshu.com/p/26ac33481b27)
 
  [MacOs](https://www.cnblogs.com/wj-1314/p/7993819.html)

* **Git的常用命令**

**Git本地生成对应SSH～key**
```
    1.在当前PC的登陆用户的主目录找寻[.ssh]文件夹，如果有点击看是否有对应RSA非堆成加密密钥 （私钥）-->[id_rsa]（公钥）-->[id_rsa.pub] 如果两个文件都存在，则不用可以忽略此条，否则看第二步
    2.在Linux，MacOS的终端，Windows的DOS命令窗口中执行[ssh-keygen -t rsa]命令，一直按enter键即可，此命令执行完了之后会默认创建[.ssh]文件夹，生成 （私钥）-->[id_rsa]（公钥）-->[id_rsa.pub] 
```
**Git克隆远程代码代码仓库**
```
    [git clone '远程仓库地址'] 实例: git clone git@github.com:ApacheEducation/Architecture.git 或 https://github.com/ApacheEducation/Architecture.git
```
**Git分支命令**
```
    [git branch] 查看本地仓库的代码分支
    [git branch -a] 查看仓库代码的所有分支
    [git checkout '分支名' 实例: git checkout feature/schedule-activity] 本地切换分支
    [git checkout -b '分支名' 实例: git checkout -b feature/schedule-activity] 本地新建分支
    [git push --set-upstream origin '分支名' 实例: git push --set-upstream origin feature/schedule-activity] 本地分支推送到远程服务器仓库
    [git branch -D '分支名' 实例: git branch -D feature/schedule-activity] 删除本地分支
    [git push origin --delete '分支名' 实例: git push origin --delete feature/schedule-activity] 删除远程服务器的分支
    [git merge '分支名' 实例: git merge feature/schedule-activity] 合并某一个分支到另一个分支
```
**Git提交文件命令**
```
    [git add .] 添加本地修改的文件
    [git commit -m '提交的的理由'] 提交文件修改的简要说明
    [git push 实例: git push] 将提交的修改推送到远程服务器
```


