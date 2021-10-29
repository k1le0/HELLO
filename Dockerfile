FROM openjdk:8-jdk-windowsservercore
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ADD run.ps1 /
RUN chmod 777 /run.sh
COPY ./target/hello-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "powershell.exe", "-File", "/run.ps1" ]
