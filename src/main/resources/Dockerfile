FROM java:8

#挂载目录
VOLUME /tmp

ADD *.jar app.jar

#暴露端口号
EXPOSE 8083

ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar" ]
