# 考勤Demo

- 此demo主要展示考勤相关功能（此部分参考官方Demo步骤）
- 项目结构
    >   - rear-end：后端模块，springboot构建，功能接口功能包括：考勤组、考勤打卡、考勤排班、考勤统计等，
        仅接入部分常用API
  >   - front-end：前端模块，react构建。



### 研发环境准备

1. 需要有一个钉钉注册企业，如果没有可以创建：https://oa.dingtalk.com/register_new.htm#/

2. 成为钉钉开发者，参考文档：https://developers.dingtalk.com/document/app/become-a-dingtalk-developer

3. 登录钉钉开放平台后台创建一个H5应用： https://open-dev.dingtalk.com/#/index

4. 配置应用

   配置开发管理，参考文档：https://developers.dingtalk.com/document/app/configure-orgapp

    - **此处配置“应用首页地址”需公网地址，若无公网ip，可使用钉钉内网穿透工具：**

      https://developers.dingtalk.com/document/resourcedownload/http-intranet-penetration

![image-20210706171740868](https://img.alicdn.com/imgextra/i4/O1CN01C9ta8k1L3KzzYEPiH_!!6000000001243-2-tps-953-517.png)



配置相关权限：https://developers.dingtalk.com/document/app/address-book-permissions

本demo使用接口相关权限：

"A权限"、"B权限"（请填写该demo需要申请的权限）

![image-20210706172027870](https://img.alicdn.com/imgextra/i3/O1CN016WCr6428wDdBhkWi6_!!6000000007996-2-tps-1358-571.png)



### 运行

**下载本项目至本地**

```shell
git clone https://github.com/open-dingtalk/h5app-XXX.git
```

### 获取相应参数

获取到以下参数，修改后端application.yaml

```yaml
app:
  app_key: *****
  app_secret: *****
  agent_id: *****
  corp_id: *****
```

参数获取方法：登录开发者后台

1. 获取corpId：https://open-dev.dingtalk.com/#/index
2. 进入应用开发-企业内部开发-点击进入应用-基础信息-获取appKey、appSecret、agentId

### 修改前端页面

**打开项目，命令行中执行以下命令，编译打包生成build文件**

```shell
cd front-end
npm install
npm run build
```

**将打包好的静态资源文件放入后端**

![image-20210706173224172](https://img.alicdn.com/imgextra/i2/O1CN01QLp1Qw1TCVrPddfjZ_!!6000000002346-2-tps-322-521.png)

### 启动项目

- 启动springboot
- 移动端钉钉点击工作台，找到应用，进入应用

### 目录结构

![](https://raw.githubusercontent.com/SwiftSongcj/h5app-demo/master/backend/src/main/resources/catalog.jpg)

- config为配置类
- constant为请求路径等常量类
- controller为控制层
- model为请求实体层
- service为业务层
- util为工具类层,AccessTokenUtil可根据自身需求更改
- lib下的jar包为项目内所需依赖,需放到项目内,或者放到maven仓库

![](https://static-aliyun-doc.oss-accelerate.aliyuncs.com/assets/img/zh-CN/6568017161/p255294.png)

- 如需使用事件订阅,需修改\java\jre\lib\security或者\java\jre\lib\security\policy\limited路径下local_policy.jar和US_export_policy.jar文件
    所需jar包在resources目录UnlimitedJCEPolicy下,不替换可能导致回调接口解密失败等情况
- 回调接口路径必须公网能直接访问，开发者可借助内网穿透工具调试
- 如果回调接口请求成功后，可在开发者后台订阅事件。各种事件回调处理方法，开发者可在Service包下CallBackServiceImpl自行实现

![](https://static-aliyun-doc.oss-accelerate.aliyuncs.com/assets/img/zh-CN/4195828061/p201854.png)

- 事件订阅具体参考官方文档，地址：https://developers.dingtalk.com/document/app/configure-event-subcription
- demo集成考勤组、考勤人员、考勤班次、考勤打卡几类常用的模块，实现了部分常用API。


### **参考文档**

1. 获取企业内部应用access_token，文档链接：https://developers.dingtalk.com/document/app/obtain-orgapp-token?spm=ding_open_doc.document.0.0.938247e54bE13v#topic-1936350
2. 考勤操作流程，文档链接：https://developers.dingtalk.com/document/app/operation-related-to-attendance-group
