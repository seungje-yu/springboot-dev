# Temurin OpenJDK 17 이미지
FROM eclipse-temurin:17
# JAR 파일 경로 설정
ARG JAR_FILE=build/libs/*.jar
# JAR 파일을 컨테이너 내부로 복사
COPY ${JAR_FILE} app.jar
# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]
