import React from 'react';
import { TouchableOpacity, Text } from 'react-native';

const MyButton = () => {
    return (
        <TouchableOpacity
        style={{
            backgroundColor: 'skyblue',
            padding: 16,
            margin: 10,
            borderRadius: 8,
        }}
        onPress={() => alert('클~~~~~~~~~~~~~~~~~~~~~~~~~릭')}
        >
            <Text style={{color: 'white', fontSize: 24, fontWeight: 900}}>My Button</Text>
        </TouchableOpacity>
    );
};

export default MyButton;