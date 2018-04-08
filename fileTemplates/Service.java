#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
@Service
public class ${NAME} {
    private static final Logger log = LoggerFactory.getLogger(${NAME}.class);
}


