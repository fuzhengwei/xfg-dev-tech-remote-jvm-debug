# 基础镜像
FROM openjdk:8-jre-slim

# 作者
MAINTAINER xiaofuge

# 配置
ENV PARAMS=""

# 时区
ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# 添加应用
ADD target/xfg-dev-tech-remote-jvm-debug-app.jar /xfg-dev-tech-remote-jvm-debug-app.jar
EXPOSE 8091 5005

ENTRYPOINT ["sh","-c","java $JAVA_REMOTE_DEBUG -jar $JAVA_OPTS /xfg-dev-tech-remote-jvm-debug-app.jar $PARAMS"]