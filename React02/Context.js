import React, {createContext, useContext} from 'react';

const ThemeContext = createContext('light');

function ThemedButton() {
    const theme = useContext(ThemeContext);

    return <button>{theme === 'light' ? '밝음' : '어두움'}</button>
}

function Context() {
    return (
        <ThemeContext.Provider value="dark">
            <ThemedButton/>
        </ThemeContext.Provider>
    );
}

export default Context;