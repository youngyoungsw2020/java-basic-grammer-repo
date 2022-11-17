package lecture7.stream.main;

class StreamTestMain2 {

    /**
     * Stream
     *   : 프로그램과 I/O객체를 연결하여 데이터를 송수신 하는 길
     *
     *     Byte Stream (binary 데이터 입출력할때, 이미지 동영상 등)
     *     Character Stream (html 문서 텍프트파일 송수신할때 등)
     *
     *
     * Stream 추상클래스 지원
     *    - 바이트 스트림
     *         InputStream                    OutputStream
     *           ByteArrayInputStream           ByteArrayOutputStream
     *           FileInputStream                FileOutputStream
     *
     *    - 문자 스트림 (Reader/Writer는 Character 기반의 최고 조상)
     *         Reader                         Writer
     *           FileReader                     FileWriter
     *
     *
     * 보조 스트림
     *    : 프로그램에서 파일을 읽기/쓰기 할 수 있도록 해줌
     *    : 위에 있는 바이트스트림 문자스트림들은 '주 스트림'으로써 "외부에서" 파일 읽기/쓰기를 수행 함.
     *
     *
     * FilterInputStream/FilterOutputStream
     * BufferedInputStream/BufferedOutputStream
     * BufferedReader/BufferedWriter
     *
     *
     *
     * 참고 > https://victorydntmd.tistory.com/134
     *
     *
     * @param args
     */
    public static void main(String[] args) {

    }

}
