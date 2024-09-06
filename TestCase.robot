*** Variables ***
${var}    Parin
*** Test Cases ***
TC01
    Log To Console     Hello World ${var}
TC02
    Log To Console     Hello World But Fail
    Fail