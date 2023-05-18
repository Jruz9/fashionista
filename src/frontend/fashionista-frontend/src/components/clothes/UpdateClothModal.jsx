import * as React from 'react';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogTitle from '@mui/material/DialogTitle';

import { useState, useEffect } from 'react'
import { Link, useParams, useNavigate } from 'react-router-dom'
import ClothServices from '../../services/ClothServices';


function UpdateClothes() {
    const [name, setName] = useState('')
    const [color, setColor] = useState('')
    const [material, setMaterial] = useState('')
    const [size, setSize] = useState('')
    const navigate = useNavigate();
    const { clothId } = useParams();
    const clothList = { name, color, material, size }
    const [open, setOpen] = React.useState(false)


    const updateGoal = (e) => {
        // e.preventDefault();
        if (e) {
            ClothServices.updateClothes(e.cloth, e).then((response) => {
                console.log(response.data)
                navigate("/savings-boards")
            }).catch(error => {
                console.log(error)
            })
        }

    }

    useEffect(() => {
        ClothServices.getClothessById(clothId).then((response) => {
            setName(response.data.name)
            setColor(response.data.color)
            setMaterial(response.data.material)
            setSize(response.data.size)
        }).catch(error => {
            console.log(error)
        })
    }, [])


    return (
        <div>
            {/* <Button variant='contained' onClick={handleClickOpen}>Crate a Goal</Button>
        <Dialog open={open} onClose={handleClose}> */}
            <DialogTitle>Update Goal</DialogTitle>
            <DialogContent>
                <TextField
                    autoFocus
                    margin="dense"
                    id="clothesName"
                    label="Cloth Name"
                    value={name}
                    type="text"
                    fullWidth
                    variant="standard"
                    onChange={(textinput) => {
                        setName(textinput.target.value)
                    }}

                />


                <TextField
                    autoFocus
                    margin="dense"
                    id="color"
                    label="color"
                    type="string"
                    fullWidth
                    variant="standard"
                    value={color}
                    onChange={(textinput) => {
                        setColor(textinput.target.value)
                    }}

                />


                <TextField
                    autoFocus
                    margin='dense'
                    id='material'
                    label="material"
                    type="string"
                    fullWidth
                    variant='standard'
                    onChange={(textinput) => {
                        setMaterial(textinput.target.value)
                    }}
                />

                <TextField
                    autoFocus margin='dense'
                    id="size"
                    label="size"
                    type="string"
                    fullWidth variant='standard'
                    InputLabelProps={{ shrink: true }}
                    onChange={(textinput) => {
                        setSize(textinput.target.value)
                    }}

                />

            </DialogContent>
            <DialogActions>
                <Button variant={"Contained"} component={Link} to="/savings-boards">Cancel</Button>
                <Button variant='Contained' onClick={() => updateGoal(clothList)}>Create</Button>
            </DialogActions>

            {/* </Dialog> */}
            {/* </container> */}
        </div>
    )
}

export default UpdateClothes;