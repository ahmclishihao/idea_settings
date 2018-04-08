#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public interface ${NAME} #if (${Parent_Interface} && ${Parent_Interface} != "")extends ${Parent_Interface} #end{
}
